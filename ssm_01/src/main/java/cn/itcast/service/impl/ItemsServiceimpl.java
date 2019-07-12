package cn.itcast.service.impl;

import cn.itcast.dao.ItemDao;
import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
class ItemsServiceimp implements ItemsService {
    @Autowired
    private ItemDao itemDao;

    public List<Items> findById(Integer id) {

        return itemDao.findById(id);
    }
}
