package com.docmind.backend.service.impl;

import com.docmind.backend.entity.KnowledgeBase;
import com.docmind.backend.mapper.KnowledgeBaseMapper;
import com.docmind.backend.service.KnowledgeBaseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnowledgeBaseServiceImpl
        implements KnowledgeBaseService {

    private final KnowledgeBaseMapper knowledgeBaseMapper;

    public KnowledgeBaseServiceImpl(
            KnowledgeBaseMapper knowledgeBaseMapper) {
        this.knowledgeBaseMapper = knowledgeBaseMapper;
    }

    @Override
    public boolean create(KnowledgeBase knowledgeBase) {
        return knowledgeBaseMapper.insert(knowledgeBase) > 0;
    }

    @Override
    public List<KnowledgeBase> list() {
        return knowledgeBaseMapper.selectList(null);
    }

    @Override
    public KnowledgeBase getById(Long id) {
        return knowledgeBaseMapper.selectById(id);
    }

    @Override
    public boolean update(KnowledgeBase knowledgeBase) {
        return knowledgeBaseMapper.updateById(knowledgeBase) > 0;
    }

    @Override
    public boolean delete(Long id) {
        return knowledgeBaseMapper.deleteById(id) > 0;
    }
}