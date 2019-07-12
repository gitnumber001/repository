package cn.itcast.dao;


import cn.itcast.domain.Items;

import java.util.List;

public interface ItemDao {

public List<Items> findById(int id);
}
