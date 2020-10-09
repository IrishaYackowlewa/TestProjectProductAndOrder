package com.TestTask21Century.service;

import com.TestTask21Century.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import com.TestTask21Century.repository.GoodsRepository;
import org.springframework.stereotype.Service;

@Service
public class GoodsServiceImpl implements EntityService<Goods> {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Goods save(Goods goods) {
        return goodsRepository.saveAndFlush(goods);
    }

    @Override
    public Goods edit(Goods goods) {
        return goodsRepository.saveAndFlush(goods);
    }

    @Override
    public Goods findById(Long id) {
        return goodsRepository.findById(id).orElse(new Goods("",0));
    }

    @Override
    public Iterable<Goods> findAll() {
        return goodsRepository.findAll();
    }

    @Override
    public void delete(Goods goods) {
        goodsRepository.delete(goods);
    }
}