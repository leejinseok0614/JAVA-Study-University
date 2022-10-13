package ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberArrayList memberarraylist = new MemberArrayList();

		Member memberLee = new Member(1001, "이진석");
		Member memberKang = new Member(1002, "강기욱");
		Member memberYong = new Member(1003, "용현정");

		memberarraylist.addMember(memberLee);
		memberarraylist.addMember(memberKang);
		memberarraylist.addMember(memberYong);

		memberarraylist.showAllMember();

		memberarraylist.removeMember(memberKang.getMemberId());
		memberarraylist.showAllMember();
	}

}
