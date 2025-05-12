package com.bigbuggers.spring_mvc.service;

import com.bigbuggers.spring_mvc.dto.ListDTO;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ListService {
    private final Map<Integer, ListDTO> listDatabase = new HashMap<>();

    public List<ListDTO> getAll() {
        return new ArrayList<>(listDatabase.values());
    }

    public ListDTO getDetail(int id) {
        return listDatabase.get(id);
    }

    public ListDTO create(ListDTO dto) {
        listDatabase.put(dto.getId(), dto);
        return dto;
    }

    public ListDTO update(int id, ListDTO dto) {
        if (!listDatabase.containsKey(id)) return null;
        dto.setId(id);

        ListDTO prevDTO = listDatabase.get(id);
        if(dto.getName() != null) prevDTO.setName(dto.getName());
        if(dto.getEmail() != null) prevDTO.setEmail(dto.getEmail());
        if(dto.getPhone() != null) prevDTO.setPhone(dto.getPhone());
        if(dto.getPassword() != null) prevDTO.setPassword(dto.getPassword());

        listDatabase.put(id, prevDTO);
        return dto;
    }

    public boolean delete(int id) {
        return listDatabase.remove(id) != null;
    }
}
