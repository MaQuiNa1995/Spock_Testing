package com.github.maquina1995.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.github.maquina1995.domain.Food;

@Repository
public class FoodRepository {

	private List<Food> foods = new ArrayList<>();
	private long idCounter;

	public Long save(Food food) {

		food.setId(null);

		this.idCounter++;

		if (this.foods.add(food)) {
			food.setId(this.idCounter);
		}

		return null;
	}

	public Food read(Long id) {

		Food food = Food.builder().id(id).build();
		int index = this.foods.indexOf(food);

		return index == -1 ? null : this.foods.get(index);

	}

	public List<Food> read() {
		return this.foods;
	}

	public boolean update(Food food) {

		int index = this.foods.indexOf(food);

		if (index == -1) {
			return false;
		}
		this.foods.set(index, food);

		return true;

	}

	public boolean delete(Long id) {

		Food food = Food.builder().id(id).build();

		if (!this.foods.contains(food)) {
			return false;
		}
		return this.foods.remove(food);
	}

}
