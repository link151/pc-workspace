package mybatis.mapper;

import mybatis.model.CreateBill;

public interface CreateBillMapper {
    int deleteByPrimaryKey(String contractid);

    int insert(CreateBill record);

    int insertSelective(CreateBill record);

    CreateBill selectByPrimaryKey(String contractid);

    int updateByPrimaryKeySelective(CreateBill record);

    int updateByPrimaryKey(CreateBill record);
}