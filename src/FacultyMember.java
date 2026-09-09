public class FacultyMember extends LibraryMember {
    public FacultyMember(int memberId, String name) {
        super(memberId, name);
    }

    @Override
    public void showMemberType() {
        System.out.println(getName() + " is a Faculty Member.");
    }
}
