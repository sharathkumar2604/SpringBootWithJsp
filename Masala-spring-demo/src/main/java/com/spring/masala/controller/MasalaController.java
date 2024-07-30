package com.spring.masala.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.masala.dto.MasalaDto;
import com.spring.masala.service.MasalaServiceImpl;

@Controller
public class MasalaController {

	@Autowired
	private MasalaServiceImpl service;

	@RequestMapping("/")
	public String message() {
		return "welcome";
	}

	@PostMapping("/save")
	public String create(MasalaDto d, Model model) {
		MasalaDto dto = service.save(d);

		if (dto == null) {

			model.addAttribute("save", " failed to save ");
			return "save";

		} else {
			model.addAttribute("save", "saved successfully");
			return "save";
		}

	}

	@GetMapping("/readAll")
	public String readAll(Model model) {
		List<MasalaDto> list = service.readAll();

		List<MasalaDto> l = new ArrayList<MasalaDto>();

		if (list.isEmpty()) {
			return "readAll";

		} else {
			for (MasalaDto d : list) {
				l.add(d);
			}
			model.addAttribute("ds", l);
			return "readAll";
		}

	}

	@GetMapping("/readById")
	public String readById(int id, Model model) {
		List<MasalaDto> list = service.readAll();

		if (list.isEmpty()) {
			model.addAttribute("ss", "ID is not present");
			return "readById";

		} else {
			for (MasalaDto d : list) {
				if (d.getId() == id) {
					model.addAttribute("ss", d);
				}
			}
			return "readById";
		}

	}

	@GetMapping("/readByBrand")
	public String readByBrand(String brand, Model model) {
		List<MasalaDto> list = service.readAll();
		List<MasalaDto> l = new ArrayList<MasalaDto>();
		if (list.isEmpty()) {
			model.addAttribute("sss", "Name and data is not present");
			return "readByName";

		} else {
			for (MasalaDto d : list) {
				if (d.getBrand().equalsIgnoreCase(brand)) {
					l.add(d);
				}
			}
			model.addAttribute("sss", l);
			return "readByName";
		}

	}

	@GetMapping("/readByType")
	public String readByType(String type, Model model) {
		List<MasalaDto> list = service.readAll();
		List<MasalaDto> l = new ArrayList<MasalaDto>();
		if (list.isEmpty()) {
			model.addAttribute("rr", "Name and data is not present");
			return "readByType";

		} else {
			for (MasalaDto d : list) {
				if (d.getType().equalsIgnoreCase(type)) {
					l.add(d);
				}
			}
			model.addAttribute("rr", l);
			return "readByType";
		}

	}

	@PostMapping("updatePriceByBrandAndId")
	public String updatePriceByBrandAndId(int price, String brand, int id, Model model) {

		if (service.updatePriceByBrandAndId(price, brand, id)) {

			model.addAttribute("up", "Updated Sucessfully");

			return "updatePriceByBrandAndId";

		}

		model.addAttribute("up", "Updated Failed, Try Again");

		return "updatePriceByBrandAndId";

	}

//	@PostMapping("/updatePriceByBrandAndId")
//	public String updatePriceByBrandAndId(int price, String brand, int id, Model model) {
//		boolean found = false;
//		List<MasalaDto> list = service.readAll();
//		for (MasalaDto q : list) {
//			if (q.getBrand().equalsIgnoreCase(brand) && q.getId() == id) {
//				q.setPrice(price);
//				found = true;
//				break;
//			}
//		}
//
//		if (found && service.updatePriceByBrandAndId(price, brand, id)) {
//			model.addAttribute("up", "updated successfully");
//			return "updatePriceByBrandAndId";
//		} else if (!found) {
//			model.addAttribute("up", "Brand and ID combination not found.");
//			return "updatePriceByBrandAndId";
//		} else {
//			model.addAttribute("up", "Failed to update");
//			return "updatePriceByBrandAndId";
//		}
//	}

	
	@PostMapping("deleteByPriceBrandAndId")
	public String deleteByPriceBrandAndId(int price, String brand, int id, Model model) {

		if (service.deleteByPriceBrandAndId(price, brand, id)) {

			model.addAttribute("del", "deleted Sucessfully");

			return "deleteByPriceBrandAndId";

		}

		model.addAttribute("del", "deleted Failed, Try Again");

		return "deleteByPriceBrandAndId";

	}
	
//	@PostMapping("/deleteByPriceBrandAndId")
//	public String deleteByPriceBrandAndId(int price, String brand, int id, Model model) {
//		boolean found = false;
//		List<MasalaDto> list = service.readAll();
//		for (MasalaDto q : list) {
//			if (q.getBrand().equalsIgnoreCase(brand) && q.getId() == id) {
//				found = true;
//				break;
//			}
//		}
//
//		if (found && service.deleteByPriceBrandAndId(price, brand, id)) {
//			model.addAttribute("del", "deleted successfully");
//			return "deleteByPriceBrandAndId";
//		} else if (!found) {
//			model.addAttribute("del", "Brand and ID combination not found.");
//			return "deleteByPriceBrandAndId";
//		} else {
//			model.addAttribute("del", "Failed to update");
//			return "deleteByPriceBrandAndId";
//		}
//	}

}
