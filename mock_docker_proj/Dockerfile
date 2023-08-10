# syntax=docker/dockerfile:1
   
FROM node:18-alpine
WORKDIR /mock_app
COPY mock_app ./
RUN npm install
RUN npm run build
CMD ["npm", "run", "start"]
EXPOSE 3000
