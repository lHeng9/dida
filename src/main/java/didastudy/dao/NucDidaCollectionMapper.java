package didastudy.dao;

import didastudy.entity.NucDidaCollection;
import java.util.List;

public interface NucDidaCollectionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaCollection record);

    NucDidaCollection selectByPrimaryKey(Long id);

    List<NucDidaCollection> selectAll();

    int updateByPrimaryKey(NucDidaCollection record);
}