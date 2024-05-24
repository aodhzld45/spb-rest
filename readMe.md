<h1 style="text-align: center;">Token 방식으로 로그인하기</h1>
<h2 style="text-align: center;">전체적인 흐름</h2>

<table style= {
      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }>
<th>Session 방식</th>
<th>토큰 방식</th>
~~~~
<tr>
    <td>Session 방식은 사용자가 로그인 요청을 보내면 사용자를 확인 후 Session ID를 발급하고 그 발급한 ID를 이용하여
다른 요청과 응답을 처리하는 방식</td>
    <td>Token 방식은 저장소의 필요 없이 로그인 시 토큰을 발급하고, 데이터 요청 시에 발급받은 토큰을 헤더를 통해 전달하여 응답을 받는 방식</td>
</tr>

</table>