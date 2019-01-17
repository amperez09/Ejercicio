import pandas as pd
file = pd.read_csv('Sacramentorealestatetransactions.csv')
df = pd.DataFrame(file)
df.to_csv('Sacramentorealestatetransactions.csv',index=False)
