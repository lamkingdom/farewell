package com.raven.farewell.testTransactional;

import java.util.HashSet;
import java.util.Set;

public class DefaultTest {
	static char a;
	static float b;

	public static void main(String[] args) {
		int[] nums = { 203963, 217800, 217801, 217802, 217803, 399307, 399308, 399309, 399310, 399311, 399312, 399313,
				399314, 399315, 399316, 166071, 166072, 166073, 518951, 25513, 367909, 197922, 9764, 367910, 881069,
				197923, 881070, 197924, 881071, 197925, 881072, 197926, 367911, 614407, 69844, 367912, 103309, 79447,
				314481, 42422, 314482, 439966, 508712, 314483, 508713, 518952, 197920, 518953, 518954, 518955, 518956,
				518957, 197921, 518958, 518959, 518960, 518961, 518962, 518963, 578922, 367906, 367907, 367908, 29450,
				4947, 671461, 671462, 305415, 671463, 491257, 671464, 671465, 671466, 671467, 45919, 671468, 45920,
				671469, 23792, 671470, 142618, 83403, 142619, 83404, 142620, 242706, 203856, 203857, 314484, 508714,
				314485, 314486, 232582, 219312, 139878, 271204, 508715, 39049, 180160, 180161, 671459, 79929, 55837,
				654051, 654052, 671460, 81191, 75772, 65287, 333691, 333692, 333693, 236676, 86969, 500246, 26024,
				535255, 58156, 535256, 174455, 535257, 174456, 535258, 174457, 535259, 174458, 133082, 840433, 840434,
				840435, 840436, 203858, 203859, 203860, 419871, 419872, 419873, 419874, 419875, 419876, 419877, 419878,
				154282, 166612, 166613, 43967, 140837, 81755, 75771, 840437, 330624, 200579, 189367, 189368, 189369,
				189370, 256477, 256478, 254509, 329664, 128988, 223753, 246380, 246381, 246382, 246383, 246384, 246385,
				246386, 246387, 246388, 523700, 246389, 246390, 246391, 242195, 138761, 138762, 272454, 138763, 138764,
				214945, 138765, 138766, 138767, 213905, 407469, 182049, 106967, 106968, 246378, 246379, 412039, 412040,
				412041, 412042, 412043, 102435, 321490, 321491, 313310, 313311, 313312, 250785, 54378, 196052, 145061,
				250786, 568812, 331658, 331659, 568813, 568814, 331660, 223142, 568815, 331661, 423401, 423402, 423403,
				423404, 423405, 423406, 179504, 259707, 412029, 412030, 412031, 412032, 412033, 412034, 412035, 412036,
				412037, 412038, 437655, 507127, 98905, 507128, 366117, 507129, 507130, 568821, 282274, 282275, 282276,
				362517, 261413, 261414, 568822, 343581, 234205, 144678, 84799, 705594, 705595, 705596, 705597, 165847,
				165848, 331368, 331662, 568816, 296938, 437650, 568817, 335630, 437651, 568818, 335631, 437652, 568819,
				335632, 437653, 568820, 335633, 437654, 98904, 466298, 705598, 466299, 705599, 466300, 379352, 338227,
				466301, 176065, 338228, 466302, 266739, 338229, 466303, 266740, 338230, 266741, 338231, 266742, 338232,
				266743, 338233, 338234, 792249, 792250, 165849, 736454, 736455, 736456, 736457, 736458, 736459, 736460,
				736461, 736462, 736463, 736464, 338226, 736465, 466294, 466295, 466296, 466297, 261997, 261998, 193372,
				193373, 193374, 62778, 62779, 62780, 62781, 62782, 538113, 538114, 538115, 538116, 538117, 538118,
				538119, 538120, 538121, 538122, 538123, 538124, 538125, 538126, 538127, 792251, 792252, 792253, 792254,
				792255, 792256, 792257, 792258, 792259, 792260, 792261, 792262, 792263, 261992, 261993, 261994, 261995,
				261996, 541511, 541512, 541513, 541514, 541515, 541516, 541517, 541518, 541519, 792264, 138233, 318081,
				138234, 318082, 138235, 318083, 138236, 318084, 792265, 103792, 723644, 792266, 103793, 723645, 792267,
				72008, 178956, 178957, 178958, 178959, 178960, 178961, 178962, 178963, 178964, 178965, 397873, 541505,
				541506, 541507, 541508, 541509, 541510, 792274, 186071, 346009, 792275, 346010, 186072, 792276, 219460,
				346011, 792277, 219461, 346012, 792278, 219462, 346013, 87922, 346014, 353195, 87923, 346015, 353196,
				87924, 346016, 87925, 353197, 103794, 792268, 723646, 103795, 792269, 103796, 723647, 792270, 150539,
				723648, 792271, 150540, 792272, 63760, 78578, 792273, 186070, 346008, 286460, 292115, 286461, 286462,
				292116, 338237, 286463, 338238, 292117, 120522, 338239, 292118, 120523, 155990, 142523, 155991, 142524,
				155992, 156742, 276052, 338240, 276053, 338241, 276054, 338242, 346017, 87926, 353198, 122571, 338235,
				353199, 286464, 338236, 286465, 353200, 286466, 292111, 286457, 292112, 286458, 292113, 286459, 292114,
				538133, 538134, 538135, 538136, 538137, 538138, 156939, 538138 };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {

			if (!set.add(nums[i])) {
				System.out.println(i);
				System.out.println(nums[i]);
			}
		}
	}

	public String test(boolean a) {
		String b = "a";
		if (a) {
			return b;
		} else {
			return "";
		}
	}
}