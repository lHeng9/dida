package didastudy.dao;

import didastudy.entity.NucDidaMessagetype;
import java.util.List;

public interface NucDidaMessagetypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaMessagetype record);

    NucDidaMessagetype selectByPrimaryKey(Long id);

    List<NucDidaMessagetype> selectAll();

    int updateByPrimaryKey(NucDidaMessagetype record);
}