package top.yeonon.yclouddisk.service;

import top.yeonon.yclouddisk.common.exception.YCDException;
import top.yeonon.yclouddisk.vo.requestvo.QueryUserInfoRequestVo;
import top.yeonon.yclouddisk.vo.requestvo.UpdateUserInfoRequestVo;
import top.yeonon.yclouddisk.vo.requestvo.UserRegistrationByPasswordRequestVo;
import top.yeonon.yclouddisk.vo.responsevo.QueryUserInfoResponseVo;
import top.yeonon.yclouddisk.vo.responsevo.UpdateUserInfoResponseVo;
import top.yeonon.yclouddisk.vo.responsevo.UserRegistrationByPasswordResponseVo;

/**
 * @Author yeonon
 * @date 2019/10/10 0010 22:51
 **/
public interface IUserService {

    /**
     * 用户注册(通过 用户名+密码的方式)
     * @param userRequestVo 用户注册Vo对象
     * @return 用户注册响应Vo对象
     * @throws YCDException 自定义业务异常
     */
    UserRegistrationByPasswordResponseVo userRegistrationByPassword(UserRegistrationByPasswordRequestVo userRequestVo)
            throws YCDException;


    /**
     * 查询用户信息（本人查看）
     * @param requestVo 请求对象
     * @return 响应对象
     * @throws YCDException 抛出的异常
     */
    QueryUserInfoResponseVo queryUserInfo(QueryUserInfoRequestVo requestVo)
            throws YCDException;

    /**
     * 查询其他用户信息
     * @param requestVo 请求对象
     * @return 响应对象
     * @throws YCDException 抛出的异常
     */
    QueryUserInfoResponseVo queryOtherUserInfo(QueryUserInfoRequestVo requestVo)
            throws YCDException;


    /**
     * 更新用户信息
     * @param requestVo 请求对象
     * @return 响应对象
     * @throws YCDException 抛出的异常
     */
    UpdateUserInfoResponseVo updateUserInfo(UpdateUserInfoRequestVo requestVo)
            throws YCDException;


}
