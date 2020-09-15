namespace UserManagement {
	public class Interest {
		private String name;
		private String description;
		private User user;
		
		public Interest(String name, String description, User user) {
			this.description = description;
			this.name = name;
			this.user = user;
		}
		
		public String getName() {
			return name;
		}
		// some code
		@Override
		public String toString() {
			String s = "Interest is " + name + ": " + description;
			return s;
		}
	}
}