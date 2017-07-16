package jsft.mapper;

import jsft.model.Draft;

public interface DraftMapper {
    int deleteByPrimaryKey(String contractid);

    int insert(Draft record);

    int insertSelective(Draft record);

    Draft selectByPrimaryKey(String contractid);

    int updateByPrimaryKeySelective(Draft record);

    int updateByPrimaryKey(Draft record);
}