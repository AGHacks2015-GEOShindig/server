package com.hackathon.torun;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by lukasz on 24.10.15.
 */
public interface EventRepository extends ElasticsearchRepository<Event,Long> {



}
