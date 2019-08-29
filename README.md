[<img src=https://user-images.githubusercontent.com/6883670/31999264-976dfb86-b98a-11e7-9432-0316345a72ea.png height=75 />](https://reactome.org)

# ChEBI Widget
Shows molecules structure from ChEBI

<img src="chebi-example.png " align="center" alt="chebi widget example">

## How to use the widget?

First add EBI Nexus repository in your pom.xml file

```xml
    <repositories>
        ...
        <!-- EBI repo -->
        <repository>
            <id>nexus-ebi-repo</id>
            <name>The EBI internal repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-repo/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
        <!-- EBI SNAPSHOT repo -->
        <repository>
            <id>nexus-ebi-snapshot-repo</id>
            <name>The EBI internal snapshot repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-snapshots/</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>
```

Then add the chebi dependency

```xml
    <dependencies>
        ...
        <dependency>
            <groupId>uk.ac.ebi.pwp.widgets</groupId>
            <artifactId>chebi</artifactId>
            <version>1.2.0</version>
        </dependency>
    <dependencies>
```

The ChEBIViewer panel can be created as follows and then placed in the right placeholder
    
```java    
    ChEBIViewer viewer = new ChEBIViewer("CHEBI:1148");
```
