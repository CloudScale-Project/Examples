#### CloudStore Example - Analyser project
-------

##### About
Complete CloudStore model, specified using ScaleDL. Analyzable via the Analyzer.

##### Author
Sebastian Lehrig

##### Project contents
- Different ScaleDL models (in root and sub folders)
- Run configurations (in "Experiments" folder)

##### Run
1. Open desired *.experiments from the "Experiments" folder in text editor
2. Adapt datasource location (datasource location="...") to your system; i.e., specify where measurements shall be stored
3. Run the launch configuration corresponding to the experiment (available also in the "Experiments" folder)

##### Possible configurations 
Different experiments come preconfigured, simply select the experiment run you are interested in:
- Elasticity experiment: measures elasticity metrics of CloudStore (database scales vertically)
- Capacity experiment: measures capacity metrics CloudStore (for a non-elastic setup)
- Scalability experiment: measures scalability metrics for CloudStore (for a setup with unlimited CPU resources)

##### Results
- Elasticity experiment: response times follow a step function for increasing load; if beyond a threshold, the next step starts again with low response times
- Capacity experiment: CloudStore has a capacity limit of ~170 concurrent users, depending on random seed
- Scalability experiment: CloudStore does not scale infinitely, due to passive resources (scalability range is ~500 concurrent users, depending on random seed)





