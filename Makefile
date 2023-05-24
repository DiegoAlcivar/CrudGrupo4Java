build-image:
    @ docker build -f devops/Dockerfile -t investigacionbackend:01 .
volumen:
    @ docker volumen create pg_investigacion_data
deploy:
    @ docker stack deploy --whit-registry-auth -c devops/stack.yml investigacion

rm:
    @ docker stack rm investigacion