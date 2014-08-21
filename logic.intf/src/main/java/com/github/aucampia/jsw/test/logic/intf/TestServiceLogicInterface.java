package com.github.aucampia.jsw.test.logic.intf;

public interface TestServiceLogicInterface
{
	public static class Info
	{
		private String name;
		public String getName()
		{
			return this.name;
		}
		public void setName( String name )
		{
			this.name = name;
		}

		private String gender;
		public String getGender()
		{
			return this.gender;
		}
		public void setGender( String gender )
		{
			this.gender = gender;
		}

	};
	public Info info( String id );
}
