package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userinfo) {

		System.out.println("Insert into MySQL DB User ID: " + userinfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into MySQL DB User ID: " + userinfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userinfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete from MySQL DB User ID: " + userinfo.getUserId());
	}

}
