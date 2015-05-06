CloudStore Example - Analyser project
-------

#### About
Complete CloudStore model, specified using ScaleDL. Analyzable via the Analyzer.

Author: Sebastian Lehrig

#### Project contents
- Different ScaleDL models (in root and sub folders)
- Run configurations (in "Experiments" folder)

#### Run
1. Open desired *.experiments from the "Experiments" folder in text editor
2. Adapt datasource location (datasource location="...") to your system; i.e., specify where measurements shall be stored
3. Run the launch configuration corresponding to the experiment (available also in the "Experiments" folder)

#### Possible configurations 
Different experiments come preconfigured, simply select the experiment run you are interested in :

- No Elasticity experiment: Measures elasticity metrics of CloudStore (but database does not scale vertically); simulations may take ~10 minutes.
- Elasticity experiment: Measures elasticity metrics of CloudStore (database scales vertically); simulations may take ~10 minutes.
- Capacity experiment: Measures capacity metrics CloudStore (for a non-elastic setup); simulations may take ~30 minutes.
- Scalability experiment: Measures scalability metrics for CloudStore (for a setup with unlimited CPU resources); simulations may take ~30 minutes.

#### Results
- No Elasticity experiment: Response times increase for increasing load.
- Elasticity experiment: Response times follow a step function for increasing load; if beyond a threshold, the next step starts again with low response times.
- Capacity experiment: CloudStore has a capacity limit of ~50 concurrent users, depending on random seed.
- Scalability experiment: CloudStore scales until the upper bound of the pre-specified interval, i.e., to 100 concurrent users. Therefore, the scalability range is at least 100 and no scalability problem was detected for that interval.





