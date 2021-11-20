/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import com.example.demo.elasticsearchRepositories.ESDocumentRepository;
import com.example.demo.models.Document;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author khoanguyen
 */
public class ESDocumentServices {
     private final ESDocumentRepository esDocumentRepository;

    @Autowired
    public ESDocumentServices(ESDocumentRepository esDocumentRepository){
        this.esDocumentRepository = esDocumentRepository;
    }

    public void save (final Document document){
        esDocumentRepository.save(document);
    }
    public void deleteById (Long id){
        esDocumentRepository.deleteById(id);
    }

}
