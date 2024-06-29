# resource-test

I couldn't really find any simple example showing how to load resources using the classloader in 
Quarkus native builds

## Creating a native executable

You can create a native executable using (needs Docker running):

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```
You can then execute your native executable with: `./target/resource-test-1.0.0-SNAPSHOT-runner`

The native jar should have the resource required added to it.
If you rename /target/quarkus-app/app/resource-test-1.0.0-SNAPSHOT.jar to a zip file then you can unpack it 
and check that the file is there.

Note you do need to set the following:

```
quarkus.native.resources.includes=subfolder/SampleFile.txt
```