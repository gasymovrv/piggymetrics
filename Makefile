.PHONY: build

#собрать образы со всех проектов из docker-compose.yml и запустить их
build:
	./init.sh && docker-compose up;
#вырубить все сервисы
stop:
	docker-compose down;