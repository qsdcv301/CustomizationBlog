# 웹 애플리케이션 개요

## 1. 프로젝트 이름

**프로젝트 이름**: BloggingCommunity

## 2. 소개

**간단한 설명**: 웹 애플리케이션이 무엇인지, 어떤 문제를 해결하는지 짧게 요약합니다.

소셜 로그인으로만 가입이 가능하며 각자의 고유의 미니 홈페이지를 꾸미고 글을 작성한다.
다른 유저와 이웃관계를 형성할 수 있고 다른 이의 홈페이지에 댓글을 남길 수 있다.

## 3. 기술 스택

웹 애플리케이션을 개발하는 데 사용된 기술을 설명합니다.

- **프론트엔드**: HTML, CSS, JavaScript, BootStrap
- **백엔드**: Spring Boot
- **데이터베이스**: MySQL
- **기타 도구**: Git, Oracle Server

## 4. 주요 기능 설명

각 주요 기능에 대해 설명합니다.

### 4.1 FileUploadService

- **설명**: 각각의 사진을 목적에 맞게 서버의 디렉토리에 저장 및 로드
- **사용 흐름**: abc@abc.com 이메일의 유저의 정보를 저장할 때 abc@abc.com/home/thumbnail\_파일이름.파일확장자 로 저장 및 로드

### 4.2 Oauth2.0 Login

- **설명**: 네이버 로그인, 구글 로그인, 카카오 로그인 등 다양한 로그인 API를 활용한 로그 지원
- **사용 흐름**: Login페이지 내에서 로그인 지원

### 4.3 Post, Comment, Category등등 CRUD 기능

- **설명**: 포스팅, 댓글, 카테고리 추가 등등의 기능들을 지원
- **사용 흐름**: 해당되는 타입의 기능들의 CRUD

### 4.4 Neighbor 기능

- **설명**: 관심있는 유저를 이웃으로 관리 및 검색 기능
- **사용 흐름**: 해당되는 타입의 기능들의 CRUD

## 5. 화면 예시

웹 애플리케이션의 주요 화면에 대한 스크린샷과 설명을 제공합니다.

- **홈페이지**: 메인 페이지.

- **기능 페이지**: 블로그 설정 페이지.

## 7. 배포 주소

- **URL**: http://138.2.126.222:8082/login

## 부록

- **연락처**: 김태현(qsdcv301@naver.com)