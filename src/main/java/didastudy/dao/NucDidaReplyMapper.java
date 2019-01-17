package didastudy.dao;

import didastudy.entity.NucDidaReply;
import java.util.List;

public interface NucDidaReplyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaReply record);

    NucDidaReply selectByPrimaryKey(Long id);

    List<NucDidaReply> selectAll();

    int updateByPrimaryKey(NucDidaReply record);
}