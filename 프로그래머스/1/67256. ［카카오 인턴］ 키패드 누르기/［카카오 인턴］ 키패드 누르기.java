class Solution {
    public String solution(int[] numbers, String hand) {
        //1,4,7은 왼손
        //3,6,9는 오른손
        //2,5,8,0은 더 가까운 손이. 똑같으면 어떤 손잡인지에 따라
        
        StringBuilder sb = new StringBuilder();

        // 왼손, 오른손 시작 위치 (*=10, #=12 로 가정)
        int left = 10;  // *
        int right = 12; // #

        for (int num : numbers) {
            // 0을 11로 치환 (편의상 키패드 위치 계산을 위해)
            if (num == 0) num = 11;

            switch (num) {
                case 1: case 4: case 7:
                    sb.append("L");
                    left = num;
                    break;
                case 3: case 6: case 9:
                    sb.append("R");
                    right = num;
                    break;
                default:
                    // 거리 계산
                    int leftDist = getDistance(left, num);
                    int rightDist = getDistance(right, num);

                    if (leftDist < rightDist) {
                        sb.append("L");
                        left = num;
                    } else if (leftDist > rightDist) {
                        sb.append("R");
                        right = num;
                    } else {
                        // 같으면 hand 기준
                        if (hand.equals("left")) {
                            sb.append("L");
                            left = num;
                        } else {
                            sb.append("R");
                            right = num;
                        }
                    }
            }
        }

        return sb.toString();
    }

    // 거리 계산: 키패드를 3칸씩 나눈 좌표로 변환
    private int getDistance(int from, int to) {
        int x1 = (from - 1) / 3;
        int y1 = (from - 1) % 3;
        int x2 = (to - 1) / 3;
        int y2 = (to - 1) % 3;

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}