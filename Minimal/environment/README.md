Minimal Example - Environment project
-------

#### About

Minimal Cloudscale Environment example project. 
It contains configurations and results for the tools (Extractor, Analyser, Static and Dynamic Spotter), together with the ScaleDL models.

##### Extractor:

Simple Apache-Tomcat Fibonacci project has been imported into Cloudscale Environment workspace, configured in the Extractor Dashboard editor and extracted.
Results can be seen by opening the Dashboard editor (project.cse file) under Extractor->Results tab.

##### Overview:

Simple Overview model with AWS deployment has been created with the Extractor->Overview import wizard.
It is saved under the	'/Minimal-Example/ScaleDL models/Overview/Alternative_2015-07-06_03-21-02' folder.
To view or edit the model, open overview.sdlo_diagram file, or navigate to the Overview tab in the Dashboard editor. Double clicking on the Overview tree view in the Dashboard, will open the Overview diagram editor. 

##### Analyser:

Analyser input, configuration and result alternatives are saved in the Environment project Analyser folder.
To view and modifie them, open the Dashboard editor by double clicking on the 'project.cse' file.
Analyser alternatives are displayed under the Analyser tab.  

###### Input alternatives
First input alternative "Fibonacci from Overview" contains Extended PCM model, transformed from the Overview model.
Second input alternative "Fibonacci from Extractor" contains Extracted partial PCM model, which is imported from the Extractor result.
Third input alternative "Fibonacci from External" is produced with the external model import wizard. It contains models from the Analyser minimal example.

###### Configuration alternatives
Normal alternative is configured for the "Fibonacci from Overview" Analyser input alternative.
Capacity alternative is configured for the "Fibonacci from Overview" Analyser input alternative.
Scalability alternative is configured for the "Fibonacci from Overview" Analyser input alternative.

###### Results
Results for all Configuration alternatives are already produced under the 'Dashboard->Analyser->Results' tab.

##### Usage evolution

Simple linear ramp is created under the 'ScaleDL->Usage evolution' folder. 
It can be displayed and modified under the Dashboard->Limbo editor. Analyser normal configuration alternative uses this Limbo alternative to simulate usage evolution.

##### Static spotter:

Static spotter Fibonacci input alternative is produced with the Extractor->Static spotter import wizard.
Basic configuration has been created and run. Results can be seen in the 'Dashboard->Static Spotter->Results' tab.

##### Dynamic spotter:

TODO:

Author: Vito Čuček

#### Project contents 

- Analyser input, configuration and results alternatives.
- Limbo model, describing the usage evolution for the Analyser.
- Partial PCM model, produced from the Fibonacci minimal example source code.
- Static spotter input, configuration and results alternatives. Static spotter input alternative is generated from the partial PCM model, produced by the Extractor.
- Dynamic spotter input, configuration and results.
- Minimal Overview model, produced from the Extractor partial PCM model, using the Extrator->Overview transforamtion wizard. 
