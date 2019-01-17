package didastudy.dao;

import didastudy.entity.NucDidaAccusation;
import java.util.List;

public interface NucDidaAccusationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaAccusation record);

    NucDidaAccusation selectByPrimaryKey(Long id);

    List<NucDidaAccusation> selectAll();

    int updateByPrimaryKey(NucDidaAccusation record);
}