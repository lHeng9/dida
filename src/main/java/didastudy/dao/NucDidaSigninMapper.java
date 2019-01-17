package didastudy.dao;

import didastudy.entity.NucDidaSignin;
import java.util.List;

public interface NucDidaSigninMapper {
    int deleteByPrimaryKey(Long id);

    int insert(NucDidaSignin record);

    NucDidaSignin selectByPrimaryKey(Long id);

    List<NucDidaSignin> selectAll();

    int updateByPrimaryKey(NucDidaSignin record);
}