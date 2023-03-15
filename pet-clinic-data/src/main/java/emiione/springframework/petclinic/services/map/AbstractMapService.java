package emiione.springframework.petclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import emiione.springframework.petclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();

	Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	T findById(ID id) {
		return map.get(id);
	}

	T save(T obj) {
		if (obj != null) {
			if (obj.getId() == null) {
				obj.setId(getNextId());
			}

			map.put(obj.getId(), obj);
		} else {
			throw new RuntimeException("Object cannot be null");
		}
		return obj;
	}

	void deleteById(ID id) {
		map.remove(id);
	}

	void delete(T obj) {
		map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
	}

	private Long getNextId() {
		Long nextID = null;

		try {
			nextID = Collections.max(map.keySet()) + 1;
		} catch (NoSuchElementException e) {
			nextID = 100L;
		}

		return nextID;
	}

}
