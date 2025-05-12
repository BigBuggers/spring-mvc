package com.bigbuggers.spring_mvc.controller;

import com.bigbuggers.spring_mvc.dto.ListDTO;
import com.bigbuggers.spring_mvc.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/list")
public class ListController {
    private final ListService listService;

    @Autowired
    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping
    public ResponseEntity<List<ListDTO>> getAll() {
        return ResponseEntity.ok(listService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ListDTO> getDetail(@PathVariable int id) {
        ListDTO dto = listService.getDetail(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<ListDTO> create(@RequestBody ListDTO dto) {
        return ResponseEntity.ok(listService.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ListDTO> update(@PathVariable int id, @RequestBody ListDTO dto) {
        ListDTO updated = listService.update(id, dto);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        return listService.delete(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}

