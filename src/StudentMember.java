public class StudentMember extends LibraryMember {
    public StudentMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void showMemberType() {
        System.out.println(getName() + " is a Student Member.");
    }
}
