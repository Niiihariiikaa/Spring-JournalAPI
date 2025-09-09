package com.example.demo.controller;

import com.example.demo.entity.JournalEntry;
import com.example.demo.service.JournalEntryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;

@RestController
@RequestMapping("/_Journal")
public class JournalEntryControllerv2 {

    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry) {

        JournalEntryService.saveEntry(myEntry);
        return true;

    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long myId){
        return null;
    }

    @DeleteMapping("id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable long myId) {
        return null;
    }

    @PutMapping("id/{id}")
    public JournalEntry deleteJournalEntryById(@PathVariable long id, @RequestBody JournalEntry myEntry ) {

        return null;
    }
}
