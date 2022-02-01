package com.github.maquina1995.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.maquina1995.domain.Food;
import com.github.maquina1995.repository.FoodRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FoodService {

	private final FoodRepository foodRepository;

	public Long save(Food food) {
		return foodRepository.save(food);
	}

	public Food read(Long id) {
		return foodRepository.read(id);
	}

	public List<Food> read() {
		return foodRepository.read();
	}

	public boolean update(Food food) {
		return foodRepository.update(food);
	}

	public boolean delete(Long id) {
		return foodRepository.delete(id);
	}

}
