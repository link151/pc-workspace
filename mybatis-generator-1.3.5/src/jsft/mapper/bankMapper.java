package jsft.mapper;

import jsft.model.bank;

public interface bankMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(bank record);

    int insertSelective(bank record);

    bank selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(bank record);

    int updateByPrimaryKey(bank record);
}