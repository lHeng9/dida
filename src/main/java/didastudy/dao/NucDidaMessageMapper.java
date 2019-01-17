package didastudy.dao;

import didastudy.entity.NucDidaMessage;
import java.util.List;

public interface NucDidaMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaMessage record);

    NucDidaMessage selectByPrimaryKey(Long id);

    List<NucDidaMessage> selectAll();

    int updateByPrimaryKey(NucDidaMessage record);
}