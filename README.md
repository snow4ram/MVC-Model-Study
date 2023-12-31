### HTTP POST - HTML Form

- 클라이언트로 부터 name , age 입력값을 Form 데이터에 저장해놓습니다.. 그것을 post 요청시 웹 브라우저는 메시지 바디에 쿼리 파라미터 형식으로 “ name =”userA” age=”25” 에 대한 쿼리 파라미터를 생성해 전달해줍니다.

### @ModelAttribute - 요청 파라미터 처리

- @ModelAttribute는 Member 객체를 생성하고, 요청 파라미터의 값을 **프로터피 접근법으로 입력해줍니다. 이를 통해 HTTP 요청에서 받은 데이터를 컨트롤러 메서드에서 쉽게 사용할 수 있습니다.**
- 주의할 점 Set() 메서드가 없으면 접근이 안돼서 입력값이 null로 처리된다.

### @ModelAttribute - Model

- @ModelAttribute 로 통해 생성된 객체를 쉽게 Model 에 값을 바인딩 해준다.

- - 위의 그림은 제가 생각하는 클라이언트로부터 POST 요청을 받아 Spring MVC 안에서 ModelAttribute가 어떻게 작동하는지에 대한 하나의 상황을 가정하여 그린 그림입니다. 양해 부탁드립니다.
![첫이미지 도전](./image/스크린샷%202023-10-29%20오전%2012.21.30.png)

- 클라이언트로부터 GET 요청으로 페이지에 접속하여 이름과 나이를 입력하는 입력창이 있을 때, 클라이언트로부터 입력 받은 후 웹브라우저에서는 Form 데이터에 값을 입력받고,
  클라이언트가 POST 요청을 보낼 때 쿼리 파라미터 형식으로 값을 controller로 전달하여 controller에서 기능을 수행하고, 수행 결과를 응답으로 반환하는 과정을 그렸습니다.
