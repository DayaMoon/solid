package comparators;

import java.util.LinkedHashMap;
import java.util.Map;

public class C
{
	 public static void main(String[] args){
			String str = "iiiiiwwwwwwwwiihhvvvspppppppppaffffiiiiiiiiudddddddddaaahhhhhrrrkkkkkkkkkxxxxxxxddddmmmmmmmmyyyoovvvvccccfffffffrrrrrrrrrrrrrtttteeeeeeeccaaaaaaajjjjjjooooooooosssssmmmrrrrrrrrnnnnnyyyyynnnnnnnnniiiiiillllllaaaaaaeeekkkkkkyyyyyyyyyfftttttttttfffffffuuuuvvvvvvvsssgggggggguuuuhhmggggggggwwwwwwhhhhhooooossccccccccciiiiiiippptttttttiiiiiiiffffffuuuuuuuuxiiiiiiillllllimmmxxbbbbbblllvvvvvvvyyyyyyggggggggllllllllluuuuuuuuuktttttpppppppppuuuuppppppppddddddtttttttttpppppppgggggggkkrrrrrrrrriiiiittttttxxxxxxuuuuuuuuugggggggggwwwwppppoooooooooooooowwwwwssppppppppxxxxxxxxxgggsssssnnnkkkkkkkkeeeeeeeeeeelcccccccckkkkkkkbbbbbbbccccffffffffpppppppddddddddtttttzzzzzrrrrrrrrrrrrrrreeewwwwwwwwwyqqqqqqkkkkccccccdlxxxxxxxxdddddgggggqrrrrrreeeeeeeeegggggggiiiifffffffnnnnnnnxxxxllllllllldddddhhhhhhhhuibbbbbbbyyoobbiijjjmmmmmmmmmdddddddddfvvvnnnnybbbbbbbbbiiiiiiittttvvvvvvqqqqqqpppppkffsccccqqqqqqqzzzzzssvvhhhhhffffffffffcvvvvvvvvkkkkkkkkkkkkkiiiiiiiijqdqqqqqqqqxxhhhssssssrruuuuuhhhhgggggggxxxxxaaaaeeezhhhhddddddddvvvvvvvvvoooooooiiiiiiiiiiiiettttttttteeeeeyyyyyyyyyyyyyyymttttttccccccccbbbqqqqqqqqeeeeeezzzzzmmmmmjjjjjjjzzzzzzzzzajjjjjjjjjjqqqqqqqqqddddddddddlliiifffffppppppppprrrwwwwwwwwwwwwzzzzzzbbbiiiiiwwwwwwwwwaaaaaaaahhhhhhhlllllqqrrrrrllbdddddddmmmmmmmmmkkkkjjjjjjyyyyyjjjjjjzzzzzzzmmmmeeeeeeeggggggggeeeeeennnnnnnrrrrwwhhhhhhhppppppppeeezooooooooonnttttteeeeeeeeeeeeeebbbyyyyyyyyyvvvmmmmmuuuuuvvvvvvvvzzzzzzzzzqqhhddddddfffffffssssqqqbxxxxxxxoooooggggggggccccvvvvvvvvzthhhhhhhddgggggwwwkkkkkppppppbbbbhhhhhhrrrrrrrlllllllpppppppgggtdddddkkkkkkkpppzdddddcccccuwwwwwwwcccceeeeeeeeejjjjjjjjppppjjqqcyyyyyyyyyveeeeeeecczmmmmmmnnnnnpppppppzzzzzzwwwwwwweewwwfffffffffeeeeeeeyyyjjjjlllllllllppgoohhhhhhhziiiiiiyyyyyyyynnnnnnnngggggggddddddddduuuuuuuuggggggmmmmmmmmyyyyyddddddddffffffcccccddddiiiiiiddddddddxxiippptttttttdduuuujjjjjjuuuuuuuuuqqqquwwwwwkkkksssssssssssssskkkkkkkkkvvvvzhhhhhhhhhhhhhhhsbbbbbbmmmmmmmmmsssssssyyyyyuufffffffffihhhhhwwwwwwwwwsssssssppttttttttppppppppppppppprrrrrrrbbbbbbbbjjjjjjkkxxxxxxxxxccccccqqeeeeeefffffrrrrrrrriiiiiccccjjjjjbbbbbfffeeeeeeeyyyyyyyyymmxxxxxxxxxqqqqqqbbccccrrroooooqnnnddddddddlsssfffffccccccccssllffccccooddddddlllllgggggggggwwwwwwwwaaaaaaaaqffffffffuuuuttttttttggkkkkccccccccrrrrrrrrruuuuuuuuuiiiiiyttttrrrrrrrrrrrrrrrbbbbbrrrrrrrrvvvvnyyyyyyyykkrrrryyyyyyyyyeekkkfffffbbbnnnnbbbbbbbbbddrrreeccrrrrakkkkkkkkkzzzzzzzzdddddddlllllllllmttttttgggghhuuuuuuuwwwwaaaaaaaaarrrlllllllfffvvvvvnnnnniiccccjjjjffffmmmmmmtnnnnnnwwwxxxxxxxxxqqqqeeeezeeffftttttttteeeeeeeeebbbbbbbbbbbbbbbcccccccckkkkkkkkkcccclllnnnnnnnnnejjooxxxxxyylleeeeeeeeedvvvvwwwwwnnnnnnnnggggggggxyyyyyyyyygggrrrrrrrrrpcmkkkkkbbbbbbbrrrrrrrrrkkkkkkkkttggglllllllcccccccccpppppppxxxiiiiooooooyyyyyyojjjjzxdddssffffffqqqqfffffffzzzzzzlllllxxxxxxxmmmmmmmmffffffffffddddddddzzzzhhhhhhuiiiiiiwwttaaaaaaaaacccccccccssssskkkkkkrrrrrrrrrppppmmmmmmmmqqqqqwwcccccccbbbbrrrddddddyyyyyyhhhhhqqqqqqqqzzzvvvvvvvvvrrrrrkkkkkkkjjjjjjssaaaaannnnnbbbiibxxxxhhhhhhhiiiiiqppppppppuuuuuuuuuuurrrrrmiizzzzzppppppppoocccccc";

			//str= "wweeaaqqqqwwbbaaa";
			char[] chars = str.toCharArray();

			StringBuffer sb = new StringBuffer();

			char prev = chars[0];
			int counter = 1;
			for (int i=1; i< chars.length; i++ ){
				if (prev == chars[i]){
					counter++;
				}
				else{
					sb.append(counter);
					sb.append(prev);
					counter=1;
					prev = chars[i];
				}
			}
			sb.append(counter);
			sb.append(prev);

			System.out.println(sb);

	 }

}
