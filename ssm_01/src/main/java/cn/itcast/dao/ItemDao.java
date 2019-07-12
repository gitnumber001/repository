package cn.itcast.dao;


import cn.itcast.domain.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemDao {

public List<Items> findById(Integer id);
}
