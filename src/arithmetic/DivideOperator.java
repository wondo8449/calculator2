package arithmetic;

// 추상클래스인 AbstractOperation을 상속받아준다
public class DivideOperator extends AbstractOperation {
    @Override
    // AbstractOperation에 있는 operate 메서드를 Override 해준다
    public double operate(int firstNumber, int secondNumber) {
        // 결과를 담을 변수를 지역변수로 선언
        double result = 0.0;

        // 만약 두번째 정수가 0이라면
        if(secondNumber == 0) {
            // 예외 처리
            throw new ArithmeticException("나눗셈의 분모는 0일 수 없습니다.");
        }
        // 연산 결과를 만들어둔 변수에 담기(여기서 double로 자동 형변환)
        result = firstNumber / secondNumber;

        // 담은 결과값을 리턴
        return result;
    }
}
