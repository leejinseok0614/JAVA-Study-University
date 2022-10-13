package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		/*
		TreeSet<String> set = new TreeSet<String> ();
		
		set.add("홍길동");
		set.add("이진석");
		set.add("용현정");
		set.add("강기욱");
		
		System.out.println(set);
		*/
		
		MemberTreeSet memberHashSet = new MemberTreeSet();

		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강감찬");

		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKang);
		memberHashSet.showAllMember();

		Member memberHong = new Member(1003, "홍길동"); // 1003 아이디 중복
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();
	}

}
