package elseif;

import javax.swing.JOptionPane;

public class Horoscope {

	public static void main(String[] args) {
		String starSign = JOptionPane.showInputDialog("What is your star sign?(no caps)(https://www.horoscopedates.com/zodiac-signs/)");
		if (starSign.equals("aries")) {
			JOptionPane.showMessageDialog(null, "he symbol for this sign is that of a ram for good reason. Aries is full of life and possesses high energy, which makes this sign always looking for a challenge. The typical Aries person is full of vitality, curiosity, and has a heightened sense of justice. They often excel at anything where a bit of competition is involved, whether this is of a cognitive nature or physical.");
			
		}
		else if(starSign.equals("taurus")) {
			JOptionPane.showMessageDialog(null, "Tarus’s symbol is the bull because this sign’s characteristic is to be peaceful and methodical. This sign is often very deliberate in their actions, relaxed, and enjoys all of the sensual pleasures that abound in this dimension. Food, drink, sex, luxury, are all sought after by the typical taruean. Because this sign loves luxury they are willing to work hard to obtain it. They are slow to anger, but once disturbed it can be volatile. ");
			
		}
		else if(starSign.equals("gemini")) {
			JOptionPane.showMessageDialog(null, "The Gemini symbol is that of a pair of twins. This is because this sign rarely likes to do anything alone. Gemini are never happier than when they are sharing ideas and concepts with someone else. Communication is a key element for this sign, so many of this sign go into occupations that include some communication in some large capacity. Curiosity is a key characteristic of this sign, and they are people persons.");
		}
		else if(starSign.equals("virgo")) {
			JOptionPane.showMessageDialog(null,"The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen. Virgo people are mild mannered on the surface, but underneath there is a flurry of activity. Their minds are never quiet; always thinking, calculating, assessing. They loves making something out of nothing, nurturing and growing small things. They tend to be extremely detail oriented and particularly like producing something that is not only useful, but beautiful and skillful."); 
		}
		else {
			JOptionPane.showMessageDialog(null, "That's not a valid star sign!");
		}
	}

}
