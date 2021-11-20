package com.example.demo.elasticsearchRepositories;

import com.example.demo.models.Document;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ESDocumentRepository extends ElasticsearchRepository<Document, Long> {
    void deleteById(Long id);

}
