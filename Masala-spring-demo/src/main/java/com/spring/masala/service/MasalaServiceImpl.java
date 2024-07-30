package com.spring.masala.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import com.spring.masala.dto.MasalaDto;
import com.spring.masala.repo.MasalaRepo;


@Service
public class MasalaServiceImpl {

	@Autowired
	private MasalaRepo repo;

	public MasalaDto save(MasalaDto dtos) {

		if (dtos.getId() > 0) {

			if (dtos.getBrand().length() > 1) {
				if (dtos.getType().length() >= 2) {
					if (dtos.getQty() > 99) {
						if (dtos.getPrice() > 9) {
							return repo.save(dtos);
						}

					}
				}
			}
		}

		return null;
	}

	public List<MasalaDto> readAll() {
		return repo.findAll();

	}

	public Object readById(int id) {

		return repo.findById(id);
	}

	public List<MasalaDto> readByBrand(String brand) {
		List<MasalaDto> list = new ArrayList<MasalaDto>();

		for (MasalaDto d : list) {
			if (d.getBrand().equalsIgnoreCase(brand)) {
				list.add(d);
			}
		}

		return list;
	}
	public List<MasalaDto> readByType(String type) {
		List<MasalaDto> list = new ArrayList<MasalaDto>();

		for (MasalaDto d : list) {
			if (d.getType().equalsIgnoreCase(type)) {
				list.add(d);
			}
		}

		return list;
	}

	public boolean updatePriceByBrandAndId(int price, String brand, int id) {
		List<MasalaDto> list = readAll();
		boolean value = false;
		for (MasalaDto d : list) {
			if (d.getBrand().equalsIgnoreCase(brand) && d.getId() == id) {
				d.setPrice(price);
				repo.save(d);
				value = true;
			}
		}
		if (value) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deleteByPriceBrandAndId(int price, String brand, int id) {
		List<MasalaDto> list = readAll();
		boolean value = false;
		for (MasalaDto d : list) {
			if (d.getBrand().equalsIgnoreCase(brand) && d.getId() == id) {
				repo.delete(d);
				value = true;
			}
		}
		if (value) {
			return true;
		} else {
			return false;
		}
	}
}

