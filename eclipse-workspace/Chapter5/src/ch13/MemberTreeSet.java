package ch13;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> treeset;

	public MemberTreeSet() {
		treeset = new TreeSet<Member>();
	}

	public void addMember(Member member) {
		treeset.add(member);
	}

	public boolean removeMember(int memberId) {

		Iterator<Member> ir = treeset.iterator();

		while (ir.hasNext()) {
			Member member = ir.next();
			int tempId = member.getMemberId();
			if (tempId == memberId) {
				treeset.remove(member);
				return true;
			}
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember() {
		for (Member member : treeset) {
			System.out.println(member);
		}
		System.out.println();
	}
}
