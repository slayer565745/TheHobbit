import java.util.ArrayList;
import java.util.Scanner;
public class Game
	{
		static int hp=0;
		static int hp1=0;
		static int st=0;
		static ArrayList<Hobbit> Game=new ArrayList<Hobbit>();
		public static void main(String[] args)
			{
				runCharacters();
				runIntro();
				runMob1();
				runMob2();
				runCharacterList();
			}
		public static void runCharacters()
		{
			Game.add(new Hobbit(2,100,1));
			Game.add(new Hobbit(1,100,2));
			Game.add(new Hobbit(2,60,3));
			Game.add(new Hobbit(2,75,4));
			Game.add(new Hobbit(1,80,5));
		}
		public static void runIntro()
			{
				int random=(int)(Math.random()*4);
				int health=0;
				int strength=0;
						health=Game.get(random).getHealth();
						strength=Game.get(random).getStrength();
				hp=health;
				st=strength;
				hp1=health;
				System.out.println("This character has strength of "+st);
				System.out.println("They also have health of "+hp);
			}
		public static void runMob1()
			{
					Scanner UI=new Scanner(System.in);
					System.out.println("You are fighting an orc!");
					int health=100;
					int strength=1;
					System.out.println("This is a basic unit with health of "+health+" and strength of "+strength);
					System.out.println("Press 1 to attack, press 2 to run!");
					int atc=0;
					int ar1=UI.nextInt();
					if(ar1==1)
						{
							for(int i=0; health>0; i++)
								{
									int attack=(int)(Math.random()*6);
									attack=attack*strength;
									hp=hp-attack; //our hp
									atc=(int)(Math.random()*10);
									health=health-(st*atc); //enemy hp
									System.out.println("He deals ["+attack+"] damage to you, while you deal ["+atc+"] damage to the monster!");
									if(i>9)
										{
											System.out.println("You have used 10 turns to kill this monster. He gains 1 strength every turn!");
											strength+=1;
										}
									if(hp<1)
										{
												System.out.println("You have lost! Your hp dropped below 0!");
												System.exit(0);
										}
								}
						}
					else	
						{
							System.out.println("You have chosen to run, you lose 100 hp!");
							hp=hp-100;
							System.out.println("You now have a total of "+hp+" health left!");
							if(hp<=0)
								{
									System.out.println("You have died!");
									System.exit(0);
									System.out.println("If you see this, get banned hacker!");
								}
						}
					System.out.println("Congratulations, you have beaten your first monster!");
					System.out.println("You are left with "+hp+" health!");
					System.out.println("Would you like to upgrade your health, strength, or fully heal yourself?");
					System.out.println("1=health, 2=strength, 3=heal");
					int upgrade=UI.nextInt();
					if(upgrade==1)
						{
						hp1=hp+10;
						hp+=10;
						}
					if(upgrade==2)
						{
						st+=1;
						}
					else
						{
						hp=hp1;
						}
					System.out.println("You now have "+hp+" health and "+st+" strength!");
			}
		public static void runMob2()
			{
						Scanner UI=new Scanner(System.in);
						System.out.println("You are fighting a Hobbit!");
						int health=60;
						int strength=1;
						System.out.println("This is an insane unit with health of "+health+" and strength of "+strength);
						System.out.println("Press 1 to attack, press 2 to run!");
						int atc=0;
						int ar1=UI.nextInt();
						if(ar1==1)
							{
								for(int i=0; health>0; i++)
									{
										int attack=(int)(Math.random()*3)+2;
										attack=attack*strength;
										hp=hp-attack;
										atc=(int)(Math.random()*10);
										health=health-(st*atc);
										System.out.println("He deals ["+attack+"] damage to you, while you deal ["+atc+"] damage to the monster!");
										int chance=(int)(Math.random()*2);
										if(chance==1)
											{
												System.out.println("This attack was from behind, dealing double damage!");
												hp=hp-attack;
											}
										if(hp<1)
											{
													System.out.println("You have lost! Your hp dropped below 0!");
													System.exit(0);
											}
									}
							}
						else	
							{
								
								System.out.println("You have chosen to run, you lose 100 hp!");
								hp=hp-100;
								System.out.println("You now have a total of "+hp+" health left!");
								if(hp<=0)
									{
										System.out.println("You have died!");
										System.exit(0);
										System.out.println("If you see this, get banned hacker!");
									}
							}
						System.out.println("Congratulations, you have beaten an advanced monster!");
						System.out.println("You are left with "+hp+" health!");
						System.out.println("Would you like to upgrade your health, strength, or fully heal yourself?");
						System.out.println("1=health, 2=strength, 3=heal");
						int upgrade=UI.nextInt();
						if(upgrade==1)
							{
							hp1=hp+10;
							hp+=10;
							}
						if(upgrade==2)
							{
							st+=1;
							}
						else
							{
							hp=hp1;
							}
						System.out.println("You now have "+hp+" health and "+st+" strength!");
			}
		public static void runCharacterList()
		{
			Scanner UI=new Scanner(System.in);
			System.out.println("You beat the game! WOW!");
			System.out.println("Would you like to see all possible characters for next time? 1=yes 2=no");
			int seechar=UI.nextInt();
			if(seechar==1)
				{
					for(Hobbit g : Game)
						{
							System.out.println("Character #"+g.getNumber());
							System.out.println(g.getStrength());
							System.out.println(g.getHealth());
						}
				}
			
		}
	}