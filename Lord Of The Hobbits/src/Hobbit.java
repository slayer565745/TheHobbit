public class Hobbit
	{
		int number;
		int strength;
		int health;
		public Hobbit(int s, int h, int n)
		{
		strength=s;
		health=h;
		number=n;
		}
		public int getNumber()
			{
				return number;
			}
		public void setNumber(int number)
			{
				this.number = number;
			}
		public int getStrength()
			{
				return strength;
			}
		public void setStrength(int strength)
			{
				this.strength = strength;
			}
		public int getHealth()
			{
				return health;
			}
		public void setHealth(int health)
			{
				this.health = health;
			}	
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
			}
	}