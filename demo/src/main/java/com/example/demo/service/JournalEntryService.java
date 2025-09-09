package com.example.demo.service;

import com.example.demo.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.JournalEntryRepository;

public class JournalEntryService {
    @Autowired
    private JournalEntryRepository JournalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        JournalEntryRepository.save(journalEntry);
    }



}
