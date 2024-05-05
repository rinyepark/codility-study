class Solution {
    public int[] solution(int[] A, int K) {
        // Implement your solution here
        int[] answer = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            answer[(i + K) % A.length] = A[i];
        }
        return answer;
    }
}