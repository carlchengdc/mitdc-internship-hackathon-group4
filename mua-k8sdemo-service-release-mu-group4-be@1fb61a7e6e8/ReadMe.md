# [**Service Name**]

## Description

## Non-Functional Requirements (NFR)
- Latency:
- Thruput:
- Apdex:
- Memory:
- CPU:
- Load Time:
- Concurrency:

## Build, Test and Deploy

*Prepare*

```	
cd <project>
git init
git add --all
git commit -m "Initial Commit"
git remote add origin <location/project>.git
git push -u origin master
```
### Build	

RSF provides you option to use Kubernetes or Pivotal technologies for service discovery

- To use Pivotal based technology stack, use following dependency
```aidl
    <!-- RSF PIVOTAL -->
    <dependency>
        <groupId>com.manulife.ap</groupId>
        <artifactId>rsf-pivotal</artifactId>
        <version>1.1.0</version>
        <type>pom</type>
    </dependency>
```

- To use CNCF/K8S based technology stack, use following dependency
```aidl
    <!-- RSF Kubernetes -->
    <dependency>
        <groupId>com.manulife.ap</groupId>
        <artifactId>rsf-k8s-parent</artifactId>
        <version>1.1.0</version>
        <type>pom</type>
        <scope>provided</scope>
    </dependency>
```
rsf-k8s-parent should NOT be used when deploying to PCF. 

*Compile*

```
mvnw clean install
```

*Run locally*

```
mvnw spring-boot:run -Dspring.profiles.active=dev
```

### PCF
*Deploy PCF cloud*

```
cf push -f manifest-dev.yml
```

### Kubernetes
*Run docker locally*

```
./cicd/docker/runDocker.sh
```

*Deploy to K8S*

```
helm install myapp <artifact>:<version>
```
